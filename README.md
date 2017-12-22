# BikeRental-FDV solutions technical interview.

This is a technical interview proposal of the company Inventive-FDV. I think the exercise is a good piece of entretainment for the mind.

Next comes the mains exercise statement of work:

# Context
A company rents bikes under following options:

1. Rental by hour, charging $5 per hour
2. Rental by day, charging $20 a day
3. Rental by week, changing $60 a week
4. Family Rental, is a promotion that can include from 3 to 5 Rentals (of any type) with a discount of 30% of the total price

# Assigment:
1. Implement a set of classes to model this domain and logic
2. Add automated tests to ensure a coverage over 85%
3. Use GitHub to store and version your code
4. Apply all the recommended practices you would use in a real project
5. Add a README.md file to the root of your repository to explain: your design, the development practices you applied and how run the tests.

Note: we don't expect any kind of application, just a set of classes with its automated tests.

# Deliverables:
The link to your repository  (this is the repository)

# The FORMER proposed solution (I'll do this more long term)

1st. I will make a UML model, just to understand the problem. 
2nd. I will generate the basic class structure (...with the very same modeler, in this case I used "genmymodel.com"). 
3rd. I will drive the development using the test cases, is slower, but still a lot of fun to code! 
4th. Iterate the 3rd step, until all the tests cases pass.

# The proposed solution

I'm going to simplify the problem, assuming things, so I can finish it on time.
Assumptions:
-There is just one type of bike.
-There is no need to check stock.
-The bikes must be rented for WHOLE numbers: weeks, days or hours...it can't be rented for one week and two days plus two hours. Nope. Out of scope.