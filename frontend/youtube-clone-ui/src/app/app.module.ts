import {NgModule from} '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {HomeComponent} from './home/home.component';
import {HeaderComponent} from './header/header.component';
import {VideoPlayerComponent} from './video-player/video-player.component';

import {VgCoreModule} from 'videogular/ngx-videogular/core';
import {NgxFileDropModule} from "ngx-file-drop";
import {HttpClientModule} from "@angular/common/http";
import {UploadVideoComponent} from './upload-video/upload-video.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {AuthService} from "./auth/auth.service";
import {MatButtonModule} from "@angular/material/button";

@NgModule({
  declaration:[
    AppComponent,
    UploadVideoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
    FormsModule,
    HttpClientModule,
    NgxFileDropModule,
    MatButtonModule,
    UploadVideoComponent
  ],
  providers: [AuthService],
  bootstrap: [AppComponent]
})
export class AppModule{ }
