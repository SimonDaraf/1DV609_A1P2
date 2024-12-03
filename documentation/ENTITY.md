# Available Operations on `ENTITY`

## SET::BACKGROUND

Sets the `BACKGROUND` color of the `ENTITY`.

`SET::BACKGROUND($red, $green, $blue)`

* `$red (8-bit Unsigned Integer) : The red value.`
* `$green (8-bit Unsigned Integer) : The green value.`
* `$blue (8-bit Unsigned Integer) : The blue value.`

## SET::LINE

Sets the `LINE` color of the `ENTITY`.

`SET::BACKGROUND($red, $green, $blue)`

* `$red (8-bit Unsigned Integer) : The red value.`
* `$green (8-bit Unsigned Integer) : The green value.`
* `$blue (8-bit Unsigned Integer) : The blue value.`

## SET::BORDER

Sets the `BORDER` styling on the `ENTITY`.

`SET::BORDER($border_option)`

* `$border_option (BorderOption) : The border styling to apply.`

## SET::WIDTH

Sets the `WIDTH` of the `ENTITY`.

`SET::WIDTH($width)`

* `$width (Float) : The width to set, clamped to 0 if negative.`

## SET::HEIGHT

Sets the `HEIGHT` of the `ENTITY`.

`SET::HEIGHT($height)`

* `$height (Float) : The height to set, clamped to 0 if negative.`

## CHANGE::WIDTH

Modifies the existing `WIDTH` with given change.

`CHANGE::WIDTH($change)`

* `$change (Float) : The change to apply to the width, clamped to 0 if resulting width is less than 0.`

## CHANGE::HEIGHT

Modifies the existing `HEIGHT` with given change.

`CHANGE::HEIGHT($change)`

* `$change (Float) : The change to apply to the height, clamped to 0 if resulting width is less than 0.`

## ADD::ATTRIBUTE

Adds an `ATTRIBUTE` to the selected `ENTITY`.

`ADD::ATTRIBUTE($name, $type, $visibility)`

* `$name (String) : The name of the attribute.`
* `$type (Type) : The type of the attribute.`
* `$visibility (Visibility) : The visibility of the attribute.`

## REMOVE::ATTRIBUTE

Removes an `ATTRIBUTE` from the selected `ENTITY`.

`REMOVE::ATTRIBUTE($attribute_id)`

* `$attribute_id (String) : The id of the attribute to remove.`

## ADD::OPERATION

Adds an `OPERATION` to the selected `ENTITY`.

`ADD::OPERATION($name, $return_type, $visibility)`

* `$name (String) : The name of the operation.`
* `$return_type (Type) : The return type of the operation.`
* `$visibility (Visibility) : The visibility of the operation.`

## REMOVE::OPERATION

Removes an `OPERATION` from the selected `ENTITY`.

`REMOVE::OPERATION($operation_id)`

* `$operation_id (String) : The id of the operation to remove.`