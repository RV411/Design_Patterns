define(function () {
    var subscribers={};

    function subscribe(type,fn) {
        if(!subscribers[type]){     //* Si no hay
            subscribers[type]=[];   //* crea uno
        }

        if(subscribers[type].indexOf(fn)==-1){ //* si no esta dentro
            subscribers[type].push(fn)         //* lo inserta 
        }
    }

    function unsubscribe(type,fn) {
        var listeners=subscribers[type];

        if(!listeners){     //* nothing to unsubscribe
            return
        }

        var index=listeners.indexOf(fn);    //* search event
        
        if(index>-1){                       //* delete event
            listeners.splice(index,1);
        }

    }

    function publish(type,evtObj) {
        if(!subscribers[type]){     //* Si no hay que publicar
            return;
        }

        if(!evtObj.type){
            evtObj.type=type;       //* add type to obj
        }

        var listeners=subscribers[type];    //

        for(var ii=0,ll=listeners.length;ii<ll;ii+=1){
            listeners[ii](evtObj);
        }
    }

    return{
        subscribe:subscribe,
        unsubscribe:unsubscribe,
        publish:publish
    };
});