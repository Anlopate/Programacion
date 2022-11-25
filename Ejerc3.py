'''
Created on 22 nov 2022

@author: anaat
'''

from ProgramModular2.Ejerc2 import isLeapYear

month=int(input("Enter one month: "))
year=int(input("Enter one year: "))
days_month=[30,28,31,30,31,30,31,31,30,31,30,31]

def computeDaysinmonth (month, year):
    num_days=0   
    if 0<month<=12:                      
        if isLeapYear(year) and month==2:          
            num_days=29
        else: 
            num_days=days_month[month-1]
    else:
        num_days=-1
    return (num_days)            
                               
print (computeDaysinmonth (month, year))
            
        
    


