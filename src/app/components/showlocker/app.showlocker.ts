import { Locker } from '../../models/app.locker';
import { LockerService } from '../../services/app.lockerservice';
import { Component } from '@angular/core';

@Component({

    selector:'show-loc',
    templateUrl:'./showlocker.html'
})
export class ShowLocker{

    locker:Locker;
    model:any={};

    constructor(private lockerservice:LockerService){}


    showlocker(){

        this.lockerservice.showLocker(this.model).subscribe((data:any)=>console.log(data))
    
    }
}