import { Locker } from '../../models/app.locker';
import { LockerService } from '../../services/app.lockerservice'
import { Component } from '@angular/core';

@Component({

    selector:'find-loc',
    templateUrl:'./findlocker.html'
})
export class FindLocker{

    locker:Locker;
    model:any={};

    constructor(private lockerservice:LockerService){}


    findlocker(){

        this.lockerservice.findLocker(this.model).subscribe((data:any)=>console.log(data))
    
    }
}