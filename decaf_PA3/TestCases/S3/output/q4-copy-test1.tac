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
    _T25 =  call _people_New
    _T23 = _T25
    parm _T23
    _T26 = VTBL <_people>
    _T27 = *(_T26 + 16)
    call _T27
    _T28 =  call _people_New
    _T29 = *(_T23 + 4)
    *(_T28 + 4) = _T29
    _T30 = *(_T23 + 8)
    *(_T28 + 8) = _T30
    _T31 = *(_T23 + 12)
    *(_T28 + 12) = _T31
    _T32 = *(_T23 + 16)
    *(_T28 + 16) = _T32
    _T33 = *(_T23 + 20)
    *(_T28 + 20) = _T33
    _T24 = _T28
    _T34 = 99
    parm _T24
    parm _T34
    _T35 = VTBL <_people>
    _T36 = *(_T35 + 8)
    call _T36
    _T37 = "a: \n"
    parm _T37
    call _PrintString
    parm _T23
    _T38 = VTBL <_people>
    _T39 = *(_T38 + 12)
    call _T39
    _T40 = "b: \n"
    parm _T40
    call _PrintString
    parm _T24
    _T41 = VTBL <_people>
    _T42 = *(_T41 + 12)
    call _T42
}

FUNCTION(_animal.setage) {
memo '_T0:4 _T1:8'
_animal.setage:
    _T43 = *(_T0 + 4)
    *(_T0 + 4) = _T1
}

FUNCTION(_animal.getage) {
memo '_T2:4'
_animal.getage:
    _T44 = *(_T2 + 4)
    parm _T44
    call _PrintInt
    _T45 = "\n"
    parm _T45
    call _PrintString
}

FUNCTION(_people.setaniage) {
memo '_T3:4 _T4:8'
_people.setaniage:
    _T46 = *(_T3 + 16)
    parm _T46
    parm _T4
    _T47 = VTBL <_animal>
    _T48 = *(_T47 + 8)
    call _T48
}

FUNCTION(_people.getage) {
memo '_T5:4'
_people.getage:
    _T49 = *(_T5 + 4)
    parm _T49
    call _PrintInt
    _T50 = "\n"
    parm _T50
    call _PrintString
    _T51 = *(_T5 + 8)
    _T52 = *(_T5 + 12)
    parm _T51
    call _PrintInt
    _T53 = 0
    _T54 = (_T51 < _T53)
    if (_T54 != 0) branch _L19
    _T55 = "+"
    parm _T55
    call _PrintString
_L19:
    parm _T52
    call _PrintInt
    _T56 = "j"
    parm _T56
    call _PrintString
    _T57 = "\n"
    parm _T57
    call _PrintString
    _T58 = *(_T5 + 16)
    parm _T58
    _T59 = VTBL <_animal>
    _T60 = *(_T59 + 12)
    call _T60
    _T61 = *(_T5 + 20)
    parm _T61
    call _PrintString
    _T62 = "\n"
    parm _T62
    call _PrintString
}

FUNCTION(_people.setage) {
memo '_T6:4'
_people.setage:
    _T63 = *(_T6 + 16)
    _T64 =  call _animal_New
    *(_T6 + 16) = _T64
    _T65 = 100
    parm _T6
    parm _T65
    _T66 = VTBL <_people>
    _T67 = *(_T66 + 8)
    call _T67
    _T68 = *(_T6 + 4)
    _T69 = 10
    *(_T6 + 4) = _T69
    _T70 = *(_T6 + 20)
    _T71 = "11"
    *(_T6 + 20) = _T71
    _T72 = *(_T6 + 8)
    _T73 = *(_T6 + 12)
    _T74 = 89
    _T75 = 0
    _T76 = 0
    _T77 = 8
    _T78 = (_T74 + _T76)
    _T79 = (_T75 + _T77)
    *(_T6 + 8) = _T78
    *(_T6 + 12) = _T79
}

