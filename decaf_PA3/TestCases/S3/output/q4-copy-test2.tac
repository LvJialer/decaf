VTABLE(_Main) {
    <empty>
    Main
}

VTABLE(_animal) {
    <empty>
    animal
    _animal.setage;
    _animal.getage;
}

VTABLE(_people) {
    <empty>
    people
    _people.setaniage;
    _people.getage;
    _people.setage;
}

FUNCTION(_Main_New) {
memo ''
_Main_New:
    _T7 = 4
    parm _T7
    _T8 =  call _Alloc
    _T9 = VTBL <_Main>
    *(_T8 + 0) = _T9
    return _T8
}

FUNCTION(_animal_New) {
memo ''
_animal_New:
    _T10 = 8
    parm _T10
    _T11 =  call _Alloc
    _T12 = 0
    *(_T11 + 4) = _T12
    _T13 = VTBL <_animal>
    *(_T11 + 0) = _T13
    return _T11
}

FUNCTION(_people_New) {
memo ''
_people_New:
    _T14 = 24
    parm _T14
    _T15 =  call _Alloc
    _T16 = 0
    _T17 = 4
    _T18 = (_T15 + _T14)
_L17:
    _T19 = (_T18 - _T17)
    _T18 = _T19
    _T20 = (_T14 - _T17)
    _T14 = _T20
    if (_T14 == 0) branch _L18
    *(_T18 + 0) = _T16
    branch _L17
_L18:
    _T21 = VTBL <_people>
    *(_T18 + 0) = _T21
    return _T18
}

FUNCTION(main) {
memo ''
main:
    _T24 =  call _people_New
    _T22 = _T24
    parm _T22
    _T25 = VTBL <_people>
    _T26 = *(_T25 + 16)
    call _T26
    _T27 =  call _people_New
    _T28 = *(_T22 + 4)
    *(_T27 + 4) = _T28
    _T29 = *(_T22 + 8)
    *(_T27 + 8) = _T29
    _T30 = *(_T22 + 12)
    *(_T27 + 12) = _T30
    _T31 = *(_T22 + 16)
    _T32 =  call _animal_New
    _T33 = *(_T31 + 4)
    *(_T32 + 4) = _T33
    *(_T27 + 16) = _T32
    _T34 = *(_T22 + 20)
    *(_T27 + 20) = _T34
    _T23 = _T27
    _T35 = 99
    parm _T23
    parm _T35
    _T36 = VTBL <_people>
    _T37 = *(_T36 + 8)
    call _T37
    _T38 = "a: \n"
    parm _T38
    call _PrintString
    parm _T22
    _T39 = VTBL <_people>
    _T40 = *(_T39 + 12)
    call _T40
    _T41 = "b: \n"
    parm _T41
    call _PrintString
    parm _T23
    _T42 = VTBL <_people>
    _T43 = *(_T42 + 12)
    call _T43
}

FUNCTION(_animal.setage) {
memo '_T0:4 _T1:8'
_animal.setage:
    _T44 = *(_T0 + 4)
    *(_T0 + 4) = _T1
}

FUNCTION(_animal.getage) {
memo '_T2:4'
_animal.getage:
    _T45 = *(_T2 + 4)
    parm _T45
    call _PrintInt
    _T46 = "\n"
    parm _T46
    call _PrintString
}

FUNCTION(_people.setaniage) {
memo '_T3:4 _T4:8'
_people.setaniage:
    _T47 = *(_T3 + 16)
    parm _T47
    parm _T4
    _T48 = VTBL <_animal>
    _T49 = *(_T48 + 8)
    call _T49
}

FUNCTION(_people.getage) {
memo '_T5:4'
_people.getage:
    _T50 = *(_T5 + 4)
    parm _T50
    call _PrintInt
    _T51 = "\n"
    parm _T51
    call _PrintString
    _T52 = *(_T5 + 8)
    _T53 = *(_T5 + 12)
    parm _T52
    call _PrintInt
    _T54 = 0
    _T55 = (_T52 < _T54)
    if (_T55 != 0) branch _L19
    _T56 = "+"
    parm _T56
    call _PrintString
_L19:
    parm _T53
    call _PrintInt
    _T57 = "j"
    parm _T57
    call _PrintString
    _T58 = "\n"
    parm _T58
    call _PrintString
    _T59 = *(_T5 + 16)
    parm _T59
    _T60 = VTBL <_animal>
    _T61 = *(_T60 + 12)
    call _T61
    _T62 = *(_T5 + 20)
    parm _T62
    call _PrintString
    _T63 = "\n"
    parm _T63
    call _PrintString
}

FUNCTION(_people.setage) {
memo '_T6:4'
_people.setage:
    _T64 = *(_T6 + 16)
    _T65 =  call _animal_New
    *(_T6 + 16) = _T65
    _T66 = 100
    parm _T6
    parm _T66
    _T67 = VTBL <_people>
    _T68 = *(_T67 + 8)
    call _T68
    _T69 = *(_T6 + 4)
    _T70 = 10
    *(_T6 + 4) = _T70
    _T71 = *(_T6 + 20)
    _T72 = "11"
    *(_T6 + 20) = _T72
    _T73 = *(_T6 + 8)
    _T74 = *(_T6 + 12)
    _T75 = 89
    _T76 = 0
    _T77 = 0
    _T78 = 8
    _T79 = (_T75 + _T77)
    _T80 = (_T76 + _T78)
    *(_T6 + 8) = _T79
    *(_T6 + 12) = _T80
}

