# Expresiones Reguleras

Objetivo

Validación de DNI y NIE mediante expresiones regulares.

Requisitos funcionales

El formato del NIE es:

•Letra X + 7 números + dígito de control

•Letra Y + 7 números + dígito de control

•Letra Z + 7 números + dígito de control

según el Número de Identificación Fiscal en la Wikipedia.

Ejemplos:

"X1234567T", "Y1234567T", "Z1234567T"

## Parte I: validación de la sintaxis de DNI y NIE.

Escribe un programa Java que, utilizando una (o varias) expresión regular que diseñes,

valide si la sintáxis de un DNI o un NIE es correcta. Es decir, has de chequear que:

•El DNI posee 8 dígitos y una letra mayúscula que no sea una I Ñ O U.

•El NIE posee una letra inicial X, Y o Z seguida de 7 dígitos, y una letra final que no  sea una I Ñ O U.

NO!! has de chequear si la letra es la que corresponde a ese DNI o NIE según el algoritmo que estudiamos en clase.

1.Utiliza estos casos test DNI correctos (testéalos):

"78484464T","72376173A","01817200Q","95882054E","63587725Q",

"26861694V","21616083Q","26868974Y","40135330P","89044648X",

2.Genera de manera automática 10 casos test DNI incorrectos y testéalos.

3.Genera de manera automática 10 casos test NIE correctos y testéalos.

4.Genera de manera automática 10 casos test NIE incorrectos y testéalos.


## Parte II: validación de la letra del DNI/NIE.

Validar tanto la sintáxis de un DNI /NIE como el dígito de control que le corresponde.

