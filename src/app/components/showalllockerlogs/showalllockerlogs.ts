import { Locker } from '../../models/app.locker';
import { LockerService } from '../../services/app.lockerservice';
import { Component } from '@angular/core';

@Component({

    selector:'add-item',
    templateUrl: 'showalllockerlogs.html',
    styleUrls: ['showalllockerlogs.component.scss']
})
export class Showalllockerlogs{

    locker:Locker;
    model:any={};
    LockerLogs:any;
    constructor(private lockerservice:LockerService){}


    showalllockerlogs(){

        this.lockerservice.showlockerlogs(this.model).subscribe((data:any)=>this.LockerLogs=data)
    
    }
}
