import { Injectable } from '@angular/core'

import { HttpClient } from '@angular/common/http';


@Injectable({
    providedIn: 'root'
})
export class LockerService {

    constructor(private http: HttpClient) { }
    addLocker(lockerlogss:any){
        
        return this.http.post("http://localhost:9093/aim/add",lockerlogss)
    }
    showlockerlogs(lockerlogss:any){
        return this.http.get("http://localhost:9093/aim/show",lockerlogss)

    }
    findLocker(lockerlogss:any){
        return this.http.post("http://localhost:9093/aim/find",lockerlogss)

    }
  
    }