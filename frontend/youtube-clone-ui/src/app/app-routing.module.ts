import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
//import {HomeComponent} from "./home/home.component";
import {UploadVideoComponent} from "./upload-video/upload-video.component";

const routes: Routes = [

  {
      path: 'upload-video', component: UploadVideoComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule{ }
