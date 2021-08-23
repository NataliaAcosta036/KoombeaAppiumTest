Feature: Precise Unit Conversion application automation
  I, as a user, want to make conversions in the application to verify its correct operation


  Scenario Outline: To convert different dimensions
    Given that the user selected the <dimension> in the Conversion application
    When the user selects the <firstMeasure> and the <secondMeasure> and enter the <valueMeasure>
    Then you should see the correct conversion <finalValue>

    Examples:
      | dimension   | firstMeasure      | secondMeasure     | valueMeasure | finalValue |
      | Longitud    | Milimetro         | Milla             |  328         |  0.0002038 |
      | Area        | Metro cuadrado    | Hectarea          |  10000       |  1         |
      | Volumen     | Litro             | Galón             |  187         |  41.1342   |
      | Velocidad   | Milla por hora    | Kilometro por hora|  200         |  321.8688  |
      | Aceleracion | Nudo por segundo  | Gal               |  20          |  1028.8889 |
      | Vel Angular | Revolución por día| Radian por hora   |  2           |  0.5236    |
      | Vel Flujo   | Litro por día     | Litro por hora    |  200000      |  8333.3333 |