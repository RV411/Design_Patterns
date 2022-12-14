//? var el=dom.getInstance().create("div");
//? el.id
//? 
//? 

var dom=(function () {
    var _counter=0;
    var instance;

    function generateId() {
        return "customId"+_counter++;
    }

    function create(tagName,id) {
        var el=document.createElement(tagName);

        el.id=id||generateId();

        return el;
    }

    function createInstance() {
        return{
            generateId:generateId,
            create:create
        };
    }

    return {
        getInstance:function () {
            return instance || (instance=createInstance());
        }
    }

}());   //?  inmediatly invoke function to contain our code