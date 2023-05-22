# A 3 dimensional array with elements spaced linearly between 0 and 40 with a step size of 2.5. 
# The array is 3 x 4 x 5. 
# The array is filled with random numbers between 0 and 100. 
# The array is printed to the screen.

import numpy as np

# Create a 3 dimensional array with elements spaced linearly between 0 and 40 with a step size of 2.5.
array = np.arange(0, 40, 2.5).reshape(3, 4, 5)

# Fill the array with random numbers between 0 and 100.
array = np.random.randint(0, 100, size=(3, 4, 5))

# Print the array to the screen.
print(array)