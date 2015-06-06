# Algorithm for lottery calculator.

## Input(s):

- winnings

## Constant(s):

- taxRate (12%)
- snowShare (20%)
- dwarfShare (20%)
- cinderellaShare (10%)
- rapunzelShare (10%)

## Output(s):

- Winner's tax
- Snow White's share
- Each Dwarf's share
- Cinderella's share
- Rapunzel's share

## Process

- Set `tax` to `winnings` multipled by `taxRate`
- Set `postTax` to `winnings` - `tax`
- Set `snow` to `postTax` × `snowShare`
- Set `postSnow` to `postTax` - `snow1`
- Set `dwarf` to `postSnow` × `dwarfShare`
- Set `cinderella` to `postSnow` × `cinderellaShare`
- Set `rapunzel` to `postSnow` × `rapunzelShare`
- Print out `tax`, `snow`, `dwarf`, `cinderella` and `rapunzel` to one decimal place.