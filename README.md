# 1DV609_A1P2
## UML - BACKEND
### Simon Danielsson - sd223ah

## Introduction

The plan for this assignment is to create a backend for some UML based application.
Instead of creating a pretty GUI the application will be simulated via the terminal.
Instead of rendering shapes, relations and associated attributes we will be displaying any related info in a
table format.

**An example would be:**

| Entity_ID    | Entity_Type | Entity_Shape | Entity_Name |
|--------------|-------------|--------------|-------------|
| eid_6sg54as3 | CLASS       | BLOCK        | HelloWorld  |
| eid_has7dfhs | INTERFACE   | BLOCK        | IHelloWorld |

**After selecting an entity:**
We should be able to see four tables, one for entity information such as coordinates, one for attributes, one for operations and one for relations.

| Coordinates | Top_Left | Top_Right  | Bottom_Left | Bottom_Right |
|-------------|----------|------------|-------------|--------------|
| Value       | 0.0, 0.0 | 100.0, 0.0 | 100.0 ,0.0  | 100.0, 100.0 |

| Attribute_ID | Attribute_Type | Attribute_Visibility | Attribute_Name |
|--------------|----------------|----------------------|----------------|
| aid_has7slvs | STRING         | PRIVATE              | myName         |
| aid_hs145sfs | INTEGER        | PROTECTED            | myNumber       |

| Operation_ID | Operation_Type | Operation_Visibility | Operation_Name |
|--------------|----------------|----------------------|----------------|
| oid_asd6f7df | VOID           | PRIVATE              | setProperty    |
| oid_kbjdf892 | STRING         | PUBLIC               | getProperty    |

| Relation_ID | Target_Entity  | Relation_Type | Multiplicity | Direction |
|-------------|----------------|---------------|--------------|-----------|
| rid_a7d9fgj | IHelloWorld    | REALIZATION   | undef, undef | TO        |