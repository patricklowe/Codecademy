'''
Calendar App to Perform:
View the calendar
Add an event to the calendar
Update an existing event
Delete an existing event
'''
from time import sleep, strftime
user_name = "Patrick"

calendar = {}

def welcome():
  print "Welcome, " + user_name + "."
  print "Calendar is opening..."
  sleep(1)
  print "Today is: " + strftime("%A %B %d, %Y")
  print "Current Time: " + strftime("%H:%M:%S")
  print "What would you like to do?"
  
def start_calendar():
  welcome()
  start = True
  while start:
    user_choice = raw_input("A to add, U to Update, V to View D to Delete, X to Exit: ")
    user_choice = user_choice.upper()
    if user_choice == 'V':
      if len(calendar.keys()) < 1:
        print "Calendar is empty"
      else:
          print calendar()
    elif user_choice == 'U':
      date = raw_input("What date?")
      update = raw_input("Enter the update: ")
      calendar[date] = update
      print "Update successful"
    elif user_choice == 'A':
      event = raw_input("Enter Event: ")
      date = raw_input("Enter Date (MM/DD/YYYY): ")
      if (len(date) > 10 or int(date[6:]) < int(strftime("%Y"))):
        print "Invalid date"
        try_again = raw_input("Try again? Y for Yes, N for No: ")
        try_again = try_again.upper()
        if try_again == 'Y':
          continue
        else:
          start = False
      else:
        calendar[date] = event
        print "Event successfully added"
        print calendar()
    elif user_choice == 'D':
      if len(calendar.keys()) < 1:
        print "Calendar is empty"
      else:
        event = raw_input("What event? ")
        for date in calendar.keys():
          if event == calendar[date]:
          	del(calendar[date])
        	print "Event successfully deleted"
        	print calendar
          else:
            print "Invalid date"
    elif user_choice == 'X':
      start = False
    else:
      print "Invalid Input, Exiting"
      start = False
start_calendar()