VTABLE(_Main) {
    <empty>
    Main
}

FUNCTION(_Main_New) {
memo ''
_Main_New:
    _T0 = 4
    parm _T0
    _T1 =  call _Alloc
    _T2 = VTBL <_Main>
    *(_T1 + 0) = _T2
    return _T1
}

FUNCTION(main) {
memo ''
main:
    _T14 = 1
    _T9 = _T14
    parm _T9
    call _PrintInt
    _T15 = "\n"
    parm _T15
    call _PrintString
    _T16 = 3
    _T17 = 0
    _T18 = 0
    _T19 = 12
    _T20 = (_T16 + _T18)
    _T21 = (_T17 + _T19)
    _T3 = _T20
    _T4 = _T21
    parm _T3
    call _PrintInt
    _T22 = 0
    _T23 = (_T3 < _T22)
    if (_T23 != 0) branch _L10
    _T24 = "+"
    parm _T24
    call _PrintString
_L10:
    parm _T4
    call _PrintInt
    _T25 = "j"
    parm _T25
    call _PrintString
    _T26 = "\n"
    parm _T26
    call _PrintString
    _T27 = 3
    _T28 = 0
    _T29 = 0
    _T30 = 45
    _T31 = (_T27 + _T29)
    _T32 = (_T28 + _T30)
    _T7 = _T31
    _T8 = _T32
    _T10 = _T3
    _T11 = _T4
    parm _T10
    call _PrintInt
    parm _T11
    call _PrintInt
    _T33 = "\n"
    parm _T33
    call _PrintString
    _T34 = (_T10 + _T11)
    _T35 = 0
    _T5 = _T34
    _T6 = _T35
    parm _T5
    call _PrintInt
    _T36 = 0
    _T37 = (_T5 < _T36)
    if (_T37 != 0) branch _L11
    _T38 = "+"
    parm _T38
    call _PrintString
_L11:
    parm _T6
    call _PrintInt
    _T39 = "j"
    parm _T39
    call _PrintString
    _T40 = "\n"
    parm _T40
    call _PrintString
    _T41 = (_T3 + _T5)
    _T42 = (_T4 + _T6)
    parm _T41
    call _PrintInt
    _T43 = 0
    _T44 = (_T41 < _T43)
    if (_T44 != 0) branch _L12
    _T45 = "+"
    parm _T45
    call _PrintString
_L12:
    parm _T42
    call _PrintInt
    _T46 = "j"
    parm _T46
    call _PrintString
    _T47 = "\n"
    parm _T47
    call _PrintString
    _T48 = (_T3 + _T5)
    _T49 = (_T4 + _T6)
    parm _T48
    call _PrintInt
    _T50 = 0
    _T51 = (_T48 < _T50)
    if (_T51 != 0) branch _L13
    _T52 = "+"
    parm _T52
    call _PrintString
_L13:
    parm _T49
    call _PrintInt
    _T53 = "j"
    parm _T53
    call _PrintString
    parm _T7
    call _PrintInt
    _T54 = 0
    _T55 = (_T7 < _T54)
    if (_T55 != 0) branch _L14
    _T56 = "+"
    parm _T56
    call _PrintString
_L14:
    parm _T8
    call _PrintInt
    _T57 = "j"
    parm _T57
    call _PrintString
    _T58 = "\n"
    parm _T58
    call _PrintString
    _T59 = (_T3 + _T5)
    _T60 = (_T4 + _T6)
    _T7 = _T59
    _T8 = _T60
    _T61 = 0
    _T62 = (_T3 + _T10)
    _T63 = (_T4 + _T61)
    _T7 = _T62
    _T8 = _T63
    _T64 = 0
    _T65 = 0
    _T66 = (_T3 + _T64)
    _T67 = (_T4 + _T65)
    _T7 = _T66
    _T8 = _T67
    _T68 = 0
    _T69 = 0
    _T70 = 0
    _T71 = (_T68 + _T10)
    _T72 = (_T69 + _T70)
    _T7 = _T71
    _T8 = _T72
    _T73 = 4
    _T74 = (_T73 + _T10)
    _T13 = _T74
    parm _T13
    call _PrintInt
    _T75 = "\n"
    parm _T75
    call _PrintString
    parm _T7
    call _PrintInt
    _T76 = 0
    _T77 = (_T7 < _T76)
    if (_T77 != 0) branch _L15
    _T78 = "+"
    parm _T78
    call _PrintString
_L15:
    parm _T8
    call _PrintInt
    _T79 = "j"
    parm _T79
    call _PrintString
    _T80 = "\n"
    parm _T80
    call _PrintString
    _T81 = (_T3 * _T5)
    _T82 = (_T4 * _T6)
    _T83 = (_T81 - _T82)
    _T84 = (_T3 * _T6)
    _T85 = (_T3 * _T6)
    _T86 = (_T84 + _T85)
    _T7 = _T83
    _T8 = _T86
    _T87 = 0
    _T88 = (_T3 * _T10)
    _T89 = (_T4 * _T87)
    _T90 = (_T88 - _T89)
    _T91 = (_T3 * _T87)
    _T92 = (_T3 * _T87)
    _T93 = (_T91 + _T92)
    _T7 = _T90
    _T8 = _T93
    _T94 = 0
    _T95 = 0
    _T96 = (_T3 * _T94)
    _T97 = (_T4 * _T95)
    _T98 = (_T96 - _T97)
    _T99 = (_T3 * _T95)
    _T100 = (_T3 * _T95)
    _T101 = (_T99 + _T100)
    _T7 = _T98
    _T8 = _T101
    _T102 = 0
    _T103 = 0
    _T104 = 0
    _T105 = (_T102 * _T10)
    _T106 = (_T103 * _T104)
    _T107 = (_T105 - _T106)
    _T108 = (_T102 * _T104)
    _T109 = (_T102 * _T104)
    _T110 = (_T108 + _T109)
    _T7 = _T107
    _T8 = _T110
    _T111 = 4
    _T112 = (_T111 * _T10)
    _T13 = _T112
    parm _T13
    call _PrintInt
    _T113 = "\n"
    parm _T113
    call _PrintString
    parm _T7
    call _PrintInt
    _T114 = 0
    _T115 = (_T7 < _T114)
    if (_T115 != 0) branch _L16
    _T116 = "+"
    parm _T116
    call _PrintString
_L16:
    parm _T8
    call _PrintInt
    _T117 = "j"
    parm _T117
    call _PrintString
    _T118 = "\n"
    parm _T118
    call _PrintString
}

