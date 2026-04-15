import java.util.Scanner;

public class nokia3310 {
 public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    while (true) {
    
        String firstPage = """ 

         NOKIA

         MENU

    1.  Phone book
    2.  Messages
    3.  Chat
    4.  Call Register
    5.  Tones1
    6.  Settings
    7.  Call divert
    8.  Games
    9.  Calculator
    10. Reminders
    11. Clock
    12. Profiles
    13. SIM sevices

    """;

    System.out.print(firstPage);
    int mainMenu = input.nextInt();

        switch (mainMenu) {
//Phonebok start
            case 1-> {
                String phoneBook = """

                1. Search
                2. Service NOs.
                3. Add name
                4. Erase
                5. Edit
                6. Assign tone
                7. send b'card
                8. options
                9. Speed dials
                10. Voice tags 

                """;
                System.out.print(phoneBook); 
                int phoneBookMenu = input.nextInt();

            if ( phoneBookMenu == 8) {
               String options = """ 

               1. Type of view
               2. Memory status

               """;
            System.out.print(options);

            }
            } 
//Message 
            case 2-> {
                String messages = """


                1. Write meessages
                2. Inbox
                3. Outbox
                4. Picture messages
                5. Templates
                6. Smileys
                7. messages
                8. Info service
                9. Voice mailbox number
                10. Service command editor

                """;
            System.out.print(messages);
            int messagesMenu = input.nextInt();

            if (messagesMenu == 7) {
                String messageSettings = """

                1. Set 1
                2. Common

               """;
            

            System.out.print(messageSettings);
            int set = input.nextInt();
            if (set == 1) {
                String setone = """

                1. Message centre number
                2. Message sent as 
                3. Message validity

                """;
                System.out.print(setone);
            }else if (set == 2) {
                String common = """ 

                1. Delivery reports
                2. Reply via same centre
                3. Character support 

                """;
                System.out.print(common);
            }
            
            }
        }
//chat
           case 3-> System.out.print("Chat");
//Call register
            case 4 -> {
                String callReg = """ 
    
                1. Missed calls
                2. Recieved calls 
                3. Dialled numbers
                4. Erase recent call list
                5. Show call duration
                6. Show call cost
                7. Call cost settings
                8. Prepaid credit
                """;
            System.out.print(callReg);
            int callMenu = input.nextInt();

            if (callMenu == 5) {
                String showCallDuration = """

                1. Last call duration
                2. All calls' duration
                3. Recieved calls duration
                4. Dialled calls' duration
                5. Clear timers
    
                """;
            System.out.print(showCallDuration);
            }

            else if (callMenu == 6) {
                String showCallsCost = """
            
                1. Last call cost
                2. All calls' cost
                3. Clear counters
                """;
            System.out.print(showCallsCost);
            }
            else if (callMenu == 7) {
                String callCostSettings = """
                1. Call cost limit
                2. Show costs in
                """;
            System.out.print(callCostSettings);
            }
            }
//tones
            case 5 -> {
                String tones = """ 

                1. Ringing tone 
                2. Ringing volume
                3. Incomiing alert
                4. Composer
                5. Messages
                6. Keypad tones
                7. Warning and game tones
                8. Vibrating alert
                9. Screen saver

                """;
            System.out.print(tones);
            }
//Settings
            case 6 -> {
                String settings = """
    
                1. Call sttings 
                2. Phone Settings
                3. Security settings
                4. Restore factory settings

                """;
                System.out.print(settings);
                int settingsMenu = input.nextInt();

            if (settingsMenu == 1) {
                String callSettingsList = """ 

                1. Automatic redial
                2. Speed dialing
                3. Call waiting option
                4. Own number sending
                5. Phone line in use 
                6. Auto,atic answer

                """;
            System.out.print(callSettingsList);
            }
            else if (settingsMenu == 2) {
                String phoneSettingsList = """ 

                1. Language
                2. Cell info display
                3. Welcome note
                4. Network selection
                5. Lights
                6. Confirm SIM service actions

                """;
            System.out.print(phoneSettingsList);
            }
            else if (settingsMenu == 3) {
                String securitySettingsList = """ 

                1. PIN code request
                2. Call barring service
                3. Fixed dialling
                4. Closed user group
                5. Phone security
                6. Change access codes
    
               """;
            System.out.print(securitySettingsList);
            }
            }

// call divert
            case 7 -> System.out.println("Call Divert");
// Game
            case 8 -> System.out.println("Games");
// Calculator
            case 9 -> System.out.println("Calculator");
// CloReminder
            case 10 -> System.out.print("Reminder");
// Clock
            case 11 -> {
            String clock = """ 

            1. Alarm clock
            2. Clock settings
            3. Date settings
            4. Stop watch
            5. Countdown timer
            6. Auto update of time and date

            """;
            System.out.print(clock);
            }
// Profiles
            case 12 -> System.out.println("Profiles");
// SIM services
            case 13 -> System.out.println("SIM services");
            
           default -> System.out.println("Invalid input!");
       }           
   } 
 }
}
