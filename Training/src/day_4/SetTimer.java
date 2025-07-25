package day_4;

import java.util.*;

public class SetTimer {

    static class Task {
        String description;
        Date alertTime;

        public Task(String description, Date alertTime) {
            this.description = description;
            this.alertTime = alertTime;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();
        Timer timer = new Timer();

        System.out.print("Enter number of tasks for today: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nTask #" + (i + 1));
            System.out.print("Enter task description: ");
            String desc = scanner.nextLine();

            System.out.print("Enter alert time in format (HH:mm): ");
            String timeInput = scanner.nextLine();
            
            try {
                Calendar calendar = Calendar.getInstance();
                String[] parts = timeInput.split(":");
                int hour = Integer.parseInt(parts[0]);
                int minute = Integer.parseInt(parts[1]);

                calendar.set(Calendar.HOUR_OF_DAY, hour);
                calendar.set(Calendar.MINUTE, minute);
                calendar.set(Calendar.SECOND, 0);

                Date alertTime = calendar.getTime();
                if (alertTime.before(new Date())) {
                    System.out.println("  Alert time is in the past. Skipping task.");
                    continue;
                }

                Task task = new Task(desc, alertTime);
                tasks.add(task);

                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("ALERT: Time for task → " + desc + " (" + timeInput + ")");
                    }
                }, alertTime);

                System.out.println("Task scheduled for: " + alertTime);

            } catch (Exception e) {
                System.out.println("Invalid time format. Try again.");
                i--; 
            }
        }

        System.out.println("\nAll tasks have been scheduled. App is running...");
        scanner.close();
    }
}
