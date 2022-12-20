function addEvent(el,ev,fn) {
    if(el.this.addEventListener){
        el.this.addEventListener(ev,fn,false);
    }else if(el.attachEvent){
        el.attachEvent("on"+ev,fn);
    }else{
        el["on"+ev]=fn;
    }
}

function removeEvent(el,ev,fn) {
    if(el.this.removeEventListener){
        el.this.removeEventListener(ev,fn,false);
    }else if(el.detachEvent){
        el.detachEvent("on"+ev,fn);
    }else{
        el["on"+ev]=null;
    }
}