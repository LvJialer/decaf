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
    _T4 = 2
    _T3 = _T4
    _T7 = 2
    _T5 = _T7
    _T8 = 3
    _T6 = _T8
    _T10 = 3
    _T11 = (_T3 * _T10)
    _T12 = 0
    _T13 = (_T11 == _T12)
    if (_T13 == 0) branch _L11
    _T14 = (_T5 + _T6)
    _T9 = _T14
    branch _L10
_L11:
    _T15 = 3
    _T16 = (_T11 == _T15)
    if (_T16 == 0) branch _L12
    _T17 = 3
    _T18 = (_T5 + _T17)
    _T9 = _T18
    branch _L10
_L12:
    _T19 = 6
    _T20 = (_T11 == _T19)
    if (_T20 == 0) branch _L13
    _T21 = 2
    _T22 = (_T6 * _T21)
    _T23 = 6
    _T24 = (_T22 + _T23)
    _T9 = _T24
    branch _L10
_L13:
    _T25 = 100
    _T9 = _T25
_L10:
    _T5 = _T9
    parm _T5
    call _PrintInt
}

