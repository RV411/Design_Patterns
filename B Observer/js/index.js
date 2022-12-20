requestAnimationFrame(["eventmanager"],function(evtman){
    function foo(evt) {
        console.log(evt.message)
    }

    //? test= component name
    //? foo= event name

    evtman.subscribe("test/foo",foo);

    evtman.publish("test/foo",{message:"custom event"});

    evtman.unsubscribe("test/foo",foo);

    evtman.publish("test/foo",{message:" Not be seen"});

})