VTABLE(_Mac) {
    <empty>
    Mac
    _Mac.Crash;
}

VTABLE(_Main) {
    <empty>
    Main
}

FUNCTION(_Mac_New) {
memo ''
_Mac_New:
    _T5 = 16
    parm _T5
    _T6 =  call _Alloc
    _T7 = 0
    *(_T6 + 4) = _T7
    *(_T6 + 8) = _T7
    *(_T6 + 12) = _T7
    _T8 = VTBL <_Mac>
    *(_T6 + 0) = _T8
    return _T6
}

FUNCTION(_Main_New) {
memo ''
_Main_New:
    _T9 = 4
    parm _T9
    _T10 =  call _Alloc
    _T11 = VTBL <_Main>
    *(_T10 + 0) = _T11
    return _T10
}

FUNCTION(_Mac.Crash) {
memo '_T0:4 _T1:8 _T2:12 _T3:16 _T4:20'
_Mac.Crash:
    _T12 = *(_T0 + 12)
    *(_T0 + 12) = _T1
    _T13 = *(_T0 + 4)
    _T14 = *(_T0 + 8)
    *(_T0 + 4) = _T2
    *(_T0 + 8) = _T3
    _T15 = *(_T0 + 12)
    parm _T15
    call _PrintInt
    _T16 = "\n"
    parm _T16
    call _PrintString
    parm _T4
    call _PrintInt
    _T17 = "\n"
    parm _T17
    call _PrintString
    _T18 = *(_T0 + 4)
    _T19 = *(_T0 + 8)
    parm _T18
    call _PrintInt
    _T20 = 0
    _T21 = (_T18 < _T20)
    if (_T21 != 0) branch _L12
    _T22 = "+"
    parm _T22
    call _PrintString
_L12:
    parm _T19
    call _PrintInt
    _T23 = "j"
    parm _T23
    call _PrintString
}

FUNCTION(main) {
memo ''
main:
    _T25 =  call _Mac_New
    _T24 = _T25
    _T26 = 2
    _T27 = 3
    _T28 = 0
    _T29 = 0
    _T30 = 4
    _T31 = (_T27 + _T29)
    _T32 = (_T28 + _T30)
    _T33 = 5
    parm _T24
    parm _T26
    parm _T31
    parm _T32
    parm _T33
    _T34 = *(_T24 + 0)
    _T35 = *(_T34 + 8)
    call _T35
}

