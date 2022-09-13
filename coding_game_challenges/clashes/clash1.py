import sys
import math

def c(x):
    if x[-1] in ".,":x=x[0:-1]
    return(x)
    
n = 1
words = "Walk, Drink, Eat, Sleep, Repeat"
sentence = words.lower().split()

rr = []

for i in sentence:
    num = [c[i]]
    if not c(i) in rr:rr+=num
