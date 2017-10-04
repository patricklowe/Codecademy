'Program will guess random numbers'

from random import randint
from time import sleep

def get_user_guess():
  user_guess = int(raw_input("Guess a Number: "))
  return user_guess

def roll_dice(number_of_sides):
  first_roll = randint(1,number_of_sides)
  second_roll = randint(1,number_of_sides)
  max_val = number_of_sides * 2
  
  print "The maximum possible value is: " + str(max_val)
  sleep(1)
  user_guess = get_user_guess()
  if user_guess > max_val:
    print "Guess not within limits"
    return
  else:
    print "Rolling..."
    sleep(2)
    print "The 1st roll is: %d" % first_roll
    sleep(1)
    print "The 2nd roll is: %d" % second_roll
    total_roll = first_roll + second_roll
    print "Total roll is: %d" % total_roll
    print "Result..."
    sleep(1)
    if user_guess > total_roll:
      print "You won!"
      return
    else:
      print "You Lost."
      return
    
roll_dice(6)