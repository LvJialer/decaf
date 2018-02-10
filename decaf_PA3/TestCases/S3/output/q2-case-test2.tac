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
    _T9 = 6
    _T3 = _T9
    _T10 = 2
    _T4 = _T10
    _T11 = 3
    _T5 = _T11
    _T13 = 3
    _T14 = (_T3 * _T13)
    _T15 = 0
    _T16 = (_T14 == _T15)
    if (_T16 == 0) branch _L11
    _T17 = (_T4 + _T5)
    _T12 = _T17
    branch _L10
_L11:
    _T18 = 3
    _T19 = (_T14 == _T18)
    if (_T19 == 0) branch _L12
    _T20 = 3
    _T21 = (_T4 + _T20)
    _T12 = _T21
    branch _L10
_L12:
    _T22 = 9
    _T23 = (_T14 == _T22)
    if (_T23 == 0) branch _L13
    _T24 = 2
    _T25 = (_T5 * _T24)
    _T26 = 6
    _T27 = (_T25 + _T26)
    _T12 = _T27
    branch _L10
_L13:
    _T28 = 100
    _T12 = _T28
_L10:
    _T4 = _T12
    parm _T4
    call _PrintInt
    _T29 = "\n"
    parm _T29
    call _PrintString
    _T30 = 3
    _T6 = _T30
    _T32 = 0
    _T33 = (_T6 == _T32)
    if (_T33 == 0) branch _L15
    _T34 = (_T4 + _T5)
    _T31 = _T34
    branch _L14
_L15:
    _T35 = 3
    _T36 = (_T6 == _T35)
    if (_T36 == 0) branch _L16
    _T37 = 3
    _T38 = (_T4 + _T37)
    _T31 = _T38
    branch _L14
_L16:
    _T39 = 6
    _T40 = (_T6 == _T39)
    if (_T40 == 0) branch _L17
    _T41 = 2
    _T42 = (_T5 * _T41)
    _T43 = 6
    _T44 = (_T42 + _T43)
    _T31 = _T44
    branch _L14
_L17:
    _T45 = 100
    _T31 = _T45
_L14:
    _T4 = _T31
    parm _T4
    call _PrintInt
    _T46 = "\n"
    parm _T46
    call _PrintString
    _T48 = 0
    _T49 = (_T3 == _T48)
    if (_T49 == 0) branch _L19
    _T50 = (_T4 + _T5)
    _T47 = _T50
    branch _L18
_L19:
    _T51 = 3
    _T52 = (_T3 == _T51)
    if (_T52 == 0) branch _L20
    _T53 = 3
    _T54 = (_T4 + _T53)
    _T47 = _T54
    branch _L18
_L20:
    _T55 = 6
    _T56 = (_T3 == _T55)
    if (_T56 == 0) branch _L21
    _T57 = 2
    _T58 = (_T5 * _T57)
    _T59 = 6
    _T60 = (_T58 + _T59)
    _T47 = _T60
    branch _L18
_L21:
    _T61 = 100
    _T47 = _T61
_L18:
    _T4 = _T47
    parm _T4
    call _PrintInt
    _T62 = "\n"
    parm _T62
    call _PrintString
    _T64 = 6
    _T65 = (_T3 - _T64)
    _T66 = 0
    _T67 = (_T65 == _T66)
    if (_T67 == 0) branch _L23
    _T68 = (_T4 + _T5)
    _T63 = _T68
    branch _L22
_L23:
    _T69 = 3
    _T70 = (_T65 == _T69)
    if (_T70 == 0) branch _L24
    _T71 = 3
    _T72 = (_T4 + _T71)
    _T63 = _T72
    branch _L22
_L24:
    _T73 = 9
    _T74 = (_T65 == _T73)
    if (_T74 == 0) branch _L25
    _T75 = 2
    _T76 = (_T5 * _T75)
    _T77 = 6
    _T78 = (_T76 + _T77)
    _T63 = _T78
    branch _L22
_L25:
    _T79 = 100
    _T63 = _T79
_L22:
    _T4 = _T63
    parm _T4
    call _PrintInt
    _T80 = "\n"
    parm _T80
    call _PrintString
    _T82 = 0
    _T83 = (_T3 == _T82)
    if (_T83 == 0) branch _L27
    _T84 = (_T4 + _T5)
    _T81 = _T84
    branch _L26
_L27:
    _T85 = 3
    _T86 = (_T3 == _T85)
    if (_T86 == 0) branch _L28
    _T87 = 3
    _T88 = (_T4 + _T87)
    _T81 = _T88
    branch _L26
_L28:
    _T89 = 6
    _T90 = (_T3 == _T89)
    if (_T90 == 0) branch _L29
    _T91 = 2
    _T92 = (_T5 * _T91)
    _T93 = 6
    _T94 = (_T92 + _T93)
    _T81 = _T94
    branch _L26
_L29:
    _T95 = 100
    _T81 = _T95
_L26:
    _T96 = 0
    _T7 = _T81
    _T8 = _T96
    parm _T7
    call _PrintInt
    _T97 = 0
    _T98 = (_T7 < _T97)
    if (_T98 != 0) branch _L30
    _T99 = "+"
    parm _T99
    call _PrintString
_L30:
    parm _T8
    call _PrintInt
    _T100 = "j"
    parm _T100
    call _PrintString
    _T101 = "\n"
    parm _T101
    call _PrintString
    _T103 = 8
    _T104 = (_T3 == _T103)
    if (_T104 == 0) branch _L32
    _T105 = (_T4 + _T5)
    _T102 = _T105
    branch _L31
_L32:
    _T106 = 3
    _T107 = (_T3 == _T106)
    if (_T107 == 0) branch _L33
    _T108 = (_T4 + _T3)
    _T102 = _T108
    branch _L31
_L33:
    _T109 = 0
    _T110 = (_T3 == _T109)
    if (_T110 == 0) branch _L34
    _T111 = 8
    _T102 = _T111
    branch _L31
_L34:
    _T112 = 100
    _T102 = _T112
_L31:
    _T113 = 0
    _T7 = _T102
    _T8 = _T113
    parm _T7
    call _PrintInt
    _T114 = 0
    _T115 = (_T7 < _T114)
    if (_T115 != 0) branch _L35
    _T116 = "+"
    parm _T116
    call _PrintString
_L35:
    parm _T8
    call _PrintInt
    _T117 = "j"
    parm _T117
    call _PrintString
    _T118 = "\n"
    parm _T118
    call _PrintString
}

