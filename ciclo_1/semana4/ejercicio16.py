# libreria numpy - Matematicas de matrices

import numpy as np

x = np.array([[1,2],[3,4]], dtype=np.float64)
y = np.array([[5,6],[7,8]], dtype=np.float64)

# suma de matrices
print(x + y)
print(np.add(x,y))

# resta de matrices
print(x - y)
print(np.subtract(x,y))

# multiplicación de matrices
print(x * y)
print(np.multiply(x,y))

# división de matrices
print(x / y)
print(np.divide(x,y))

# realizar raiz cuadrada de la matriz
print(np.sqrt(x))