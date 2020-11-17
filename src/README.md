# Examen POA 2019-2019

## Questions

### 1.1 Quel patrons utliser et pourquoi ?
- Factory: pour la création de loggeurs (FILE ou CONSOLE)
- Singleton : pour qu'il ne puisse exister qu'une seule instance du logger de console
- Builder : Pour la création d'un message.
- State: Pour l'état du logger (selon le niveau du logger afficher tel ou tel niveau de log)
- Singleton : pour les états du logger.