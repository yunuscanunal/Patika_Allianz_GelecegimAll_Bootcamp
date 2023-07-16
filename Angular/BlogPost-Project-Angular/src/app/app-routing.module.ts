import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserListComponent } from './pages/user/user-list/user-list.component';
import { PostListComponent } from './pages/post/post-list/post-list.component';

const routes: Routes = [
  { path: "userlist", component: UserListComponent },
  { path: "postlist", component: PostListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }