

1. A car rental company needs an application that manages data relating to the vehicle fleet. In
in particular, for each vehicle it is necessary to have the following data (grouped in the Vehicle class):
•Make (e.g. FIAT, Ford, etc.)
•Model (e.g. Punto, Escort, etc.)
•License plate
•Year of registration
•Year of the last revision
Also define, also in relation to the next class, the constructor (s) plus
appropriate (i) and the necessary methods, for example methods to modify and read the data
contained in the class.
The operations relating to the management of the vehicle fleet are as follows (to be carried out
in the GestioneAutomezzi class), where the vehicle fleet can be represented ad
example through an array / vector of Vehicles:
l Insertion of the N vehicles belonging to the vehicle fleet, with N number
of lines in the input file (the input file is used only for the first insertion)
the Purchase / Addition of a new vehicle (in new vehicles, the year of the last
revision and year of registration are the same as the current year)
l Dismissal / Cancellation of a vehicle (given the license plate)
l Search and print on System.out all the data of a vehicle given the license plate number
l Search and print on System.out of all vehicles in which the last year
revision:
coincides with the year of enrollment and is 4 years earlier than
to the current year, or
is 2 years earlier than the current year
l Print the list of all the models present on System.out (N.B. if a model is
present several times must be considered only once in the list)
l Print the list of all the models present in the file (N.B. if a model is present
several times should be considered only once in the list)
To verify the correctness of your implementation, make a main method that
use all the methods of the Vehicle Management class (through a selection menu described
in the accompanying message to this text). This main can be added to the
CarManagement class, or you can use a third class that uses the methods of
Vehicle management.
