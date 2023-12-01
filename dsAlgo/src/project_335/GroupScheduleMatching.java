package project_335;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReference;

public class GroupScheduleMatching {

    public static Date convertToDateTime(String timeStr) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        return format.parse(timeStr);
    }

    public static ArrayList<String[]> findAvailableSlots(ArrayList<String[]> busySchedule, String[] workingPeriod, int minimumDuration) throws ParseException {
    	
    	for(String[] busyS : busySchedule) {
    		for(String busy: busyS) {
    			System.out.println("b" + busy);
    		}
    	}
    	
    	for(String busy: workingPeriod) {
			System.out.println("w" + busy);
		}
    	System.out.println("min: " + minimumDuration);
    	
        Date workingStart = convertToDateTime(workingPeriod[0]);
        Date workingEnd = convertToDateTime(workingPeriod[1]);

        ArrayList<Date[]> busyIntervals = new ArrayList<>();
        for (String[] interval : busySchedule) {
            if (interval.length == 2) {
                Date busyStart = convertToDateTime(interval[0]);
                Date busyEnd = convertToDateTime(interval[1]);
                busyIntervals.add(new Date[]{busyStart, busyEnd});
            }
        }

        ArrayList<String[]> availableSlots = new ArrayList<>();

        AtomicReference<Date> slotStart = new AtomicReference<>(workingStart);

        while (slotStart.get().before(workingEnd)) {
            Date slotEnd = new Date(slotStart.get().getTime() + minimumDuration * 60 * 1000);

            boolean isSlotAvailable = busyIntervals.stream()
                    .allMatch(interval -> slotEnd.before(interval[0]) || slotStart.get().after(interval[1]));

            if (isSlotAvailable && slotEnd.before(workingEnd)) {
                availableSlots.add(new String[]{
                        new SimpleDateFormat("HH:mm").format(slotStart.get()),
                        new SimpleDateFormat("HH:mm").format(slotEnd)
                });
                // Incrementing the slotStart by minimumDuration
                slotStart.set(new Date(slotEnd.getTime() + 1 * 60 * 1000));
            } else {
                // Incrementing the slotStart by 1 minute
                slotStart.set(new Date(slotStart.get().getTime() + 1 * 60 * 1000));
            }
        }

        return availableSlots;
    }

    public static ArrayList<String[]> concatArrayLists(ArrayList<String[]> list1, ArrayList<String[]> list2) {
        ArrayList<String[]> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static void main(String[] args) throws ParseException {
        // Sample Input
        ArrayList<String[]> person1Schedule = new ArrayList<String[]>() {{
            add(new String[]{"7:00", "8:30"});
            add(new String[]{"12:00", "13:00"});
            add(new String[]{"16:00", "18:00"});
        }};
        String[] person1DailyAct = {"9:00", "19:00"};

        ArrayList<String[]> person2Schedule = new ArrayList<String[]>() {{
            add(new String[]{"9:00", "10:30"});
            add(new String[]{"12:20", "13:30"});
            add(new String[]{"14:00", "15:00"});
            add(new String[]{"16:00", "17:00"});
        }};
        String[] person2DailyAct = {"9:00", "18:30"};

        int durationOfMeeting = 30;

        // Convert input to the required format
        ArrayList<String[]> person1BusySchedule = new ArrayList<>(person1Schedule);
        person1BusySchedule.add(0, new String[]{person1DailyAct[0]});
        person1BusySchedule.add(new String[]{person1DailyAct[1]});

        ArrayList<String[]> person2BusySchedule = new ArrayList<>(person2Schedule);
        person2BusySchedule.add(0, new String[]{person2DailyAct[0]});
        person2BusySchedule.add(new String[]{person2DailyAct[1]});

        // Find available slots
        ArrayList<String[]> result = findAvailableSlots(
                concatArrayLists(person1BusySchedule, person2BusySchedule),
                person1DailyAct,
                durationOfMeeting
        );

        // Sample Output
        for (String[] slot : result) {
            System.out.println("[" + slot[0] + ", " + slot[1] + "]");
        }
    }
}
