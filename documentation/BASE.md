## DISPLAY

The `DISPLAY` command allows a user to display created entities.

### DISPLAY::ALL

The `DISPLAY::ALL` command displays every entity in the runtime registry.

### DISPLAY::ENTITY

The `DISPLAY::ENTITY` command allows users to display a specific entity.

`DISPLAY::ENTITY($entity_id)`

* `entity_id (String) : The id of the entity to display.`

## CREATE::ENTITY

Creates an `ENTITY` and adds it to the runtime registry.

`CREATE::ENTITY($name, $visibility, $stereotype)`

* `$name (String) : The entity name.`
* `$visibility (Visibility) : The entity visibility.`
* `$stereotype (Stereotype) : The entity stereotype.`

## SELECT

`SELECT` allows us to select an existing object perform further operations on it.
Every operation that can be performed on an object requires selecting said object first.

`SELECT($entity_id)` is used followed by `->` which allows the user to then perform an operation on the selected entity.

`SELECT($entity_id)->SELECT::ATTRIBUTE($attribute_id)` we can also select objects associated with an object.