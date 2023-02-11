#Autor: rodrigocastp05@gmail.com

Feature: Creacion de reunion exitosa
  Yo como postulante a la vacante Automatizador QA
  Requiero ingresar en la pagina demo.serenity
  y realizar ejercicios de automatizacion.


  Scenario: Reunion exitosa
    Given Deseo ir a la pagina demo.serenity
    And ingreso con usuario "admin" y contraseña "serenity"
    When voy la pagina de Meetings
    When creo una nueva reunion, llenando los datos del formulario
      |MeetingName        |Type   |Number| StarDate    | StarTime | EndDate     | EndTime | Location | Unit          |OrganizedBy |  Reporter  |               Attendee              |
      |technical interview|General|  01  | 02/22/2023  | 10:00    | 02/22/2023  |  11:00  | On Site  | Administration|Aaron Taylor|Aaron Taylor|Aaron Taylor,Adam Edwards,Adam Stewart|
    Then valido la creacion de la reunion "technical interview"

