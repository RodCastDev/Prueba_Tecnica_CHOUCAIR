#Autor: rodrigocastp05@gmail.com

Feature:Login Exitoso
  Yo como postulante a la vacante Automatizador QA
  Requiero ingresar en la pagina demo.serenity
  y realizar ejercicios de automatizacion.

  Scenario:Login exitoso
    Given Deseo ir a la pagina demo.serenity
    When ingreso con usuario "admin" y contraseña "serenity"
    Then valido que se habilite el panel de instrumentos

  Scenario:Login No Exitoso
    Given Deseo ir a la pagina demo.serenity
    When ingreso con credenciales invalidas usuario "invalid_admin" y contraseña "0000"
    Then valido que el Login sea fallido
