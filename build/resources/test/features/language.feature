#Autor: rodrigocastp05@gmail.com

Feature:Cambio de idioma exitoso.
  Yo como postulante a la vacante Automatizador QA
  Requiero ingresar en la pagina demo.serenity
  y realizar ejercicios de atomatizacion.

  @idiomTest
  Scenario Outline: Sleccion idioma
    Given Deseo ir a la pagina demo.serenity
    And ingreso con usuario "admin" y contraseña "serenity"
    When selecciono el idioma deseado <idioma>
    Then valido que el idioma seleccionado sea <texto>

    Examples:
    |idioma    |texto|
    |Italian   |Cruscotto|
    |Portuguese|Painel de instrumentos|
