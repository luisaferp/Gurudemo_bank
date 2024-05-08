# language: en
Feature: automatizar el login para ingresar a guru y agregar a un nuevo cliente
    como un usuario quiero ingresar a guru para agregar un nuevo cliente al banco

  @caso1
  Scenario: ingreso exitoso
    Given que luisa ingresa a guru
    When digita la credenciales
    Then Verifico que inicio correctamente
