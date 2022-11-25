'''
Created on 24 nov 2022

@author: anaat
'''


date=[18,7,1980]

def getDayOfWeek (date):
    week=["Sunday", "Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    a=(14-(date[1])//12)
    y=date[2]-a
    m=date[1]+12*a-2
    d=(date[0]+y+y//4-y//100+y//400 + (31*m)//12)%7
    for i in range (len(week)):
        if i==d:
            day=week[i]  
    return day
    
print (getDayOfWeek (date))

