import { Locker } from '../../models/app.locker';
import { LockerService } from '../../services/app.lockerservice';
import { Component } from '@angular/core';

@Component({

    selector:'add-item',
    templateUrl:'additems.html',
    styleUrls: ['additems.component.scss']
})
export class AddItem{

    locker:Locker;
    model:any={};

    constructor(private lockerservice:LockerService){}


    addlockerlog(){

        this.lockerservice.addLocker(this.model).subscribe((data:any)=>console.log(data))
    
    }
}