import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { UserModule } from './pages/user/user-module';
import { PostsModule } from './pages/post/post-module';
import { CommentsModule } from './pages/comment/comment-module';
import { CategoryModule } from './pages/category/category-module';
import { NavbarComponent } from './components/navbar/navbar';
import { ButtonComponent } from './components/button/button';

@NgModule({
  declarations: [
    AppComponent,
    ButtonComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
  exports: [ButtonComponent]
})
export class AppModule { }