import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app/components/app/app.component';
import {Routes,RouterModule} from '@angular/router'
import{HttpClientModule} from '@angular/common/http'
import{FormsModule} from '@angular/forms'
import { AddLockerlog } from './app/components/addlockerlog/app.addlockerlog';
import { ShowLocker } from './app/components/showlocker/app.showlocker';
import { FindLocker } from './app/components/findlocker/app.findlocker';
import {HomeComponent} from './app/components/home/home.component'
import { AddItem } from './app/components/additems/app.additems';
import {Showalllockerlogs} from './app/components/showalllockerlogs/showalllockerlogs'

const routes:Routes=[
    {path:'addlockerlog',component:AddLockerlog},
    {path:'showlocker',component:ShowLocker},
    {path:'additems',component:AddItem},
    {path:'showalllockerlogs',component:Showalllockerlogs},
    {path:'searchlocker',component:FindLocker},
    {path:'',component:HomeComponent},
    {path:'home',redirectTo:''}
    
]




@NgModule({
    imports: [
        BrowserModule,
        HttpClientModule,
        FormsModule, RouterModule.forRoot(routes)
        
    ],
    declarations: [
        AppComponent,AddLockerlog,ShowLocker,FindLocker,HomeComponent,AddItem,Showalllockerlogs
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }