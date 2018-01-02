/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function checkEmpty(value) {
    if (value == '') {
        alert('Value is empty');
    } else {
        alert('Value is not empty');
    }
}

function checkUsername() {
    var e = document.getElementById('username');
    var p = document.getElementById('pass');
    if (e.value == '') {
        e.style.backgroundColor = 'red';
    } else {
        e.style.backgroundColor = 'white';
    }
    if (p.value == '') {
        p.style.backgroundColor = 'red';
    } else {
        p.style.backgroundColor = 'white';
    }
    if (p.value != '' && e.value != '') {
        var f = document.getElementById('form1');
        f.action = 'LoginAction';
        f.submit();
    }


}

