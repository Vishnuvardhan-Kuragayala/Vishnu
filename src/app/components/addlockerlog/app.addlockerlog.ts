import { Locker } from '../../models/app.locker';
import { LockerService } from '../../services/app.lockerservice';
import { Component } from '@angular/core';

@Component({

    selector:'add-loc',
    templateUrl:'addlockerlog.html',
    styleUrls: ['addlocker.component.scss']
})
export class AddLockerlog{

    locker:Locker;
    model:any={};

    constructor(private lockerservice:LockerService){}


    addlockerlog(){

        this.lockerservice.addLocker(this.model).subscribe((data:any)=>console.log(data))
    
    }
}