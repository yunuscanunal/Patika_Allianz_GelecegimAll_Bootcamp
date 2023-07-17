import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserListComponent } from './pages/user/user-list/user-list.component';
import { PostListComponent } from './pages/post/post-list/post-list.component';
import { UserAddComponent } from './pages/user/user-add/user-add.component';
import { PostAddComponent } from './pages/post/post-add/post-add.component';
import { PostDetailedComponent } from './pages/post/post-detailed/post-detailed.component';
import { CommentListComponent } from './pages/comment/comment-list/comment-list.component';
import { CommentAddComponent } from './pages/comment/comment-add/comment-add.component';
import { CategoryListComponent } from './pages/category/category-list/category-list.component';
import { CategoryAddComponent } from './pages/category/category-add/category-add.component';




const routes: Routes = [
  { path: "userList", component: UserListComponent },
  { path: "postList", component: PostListComponent },
  { path: "userAdd", component: UserAddComponent },
  { path: "postAdd", component: PostAddComponent },
  { path: "postList/:id", component: PostDetailedComponent },
  { path: "categoryListComponent", component: CategoryListComponent },
  { path: "categoryAddComponent", component: CategoryAddComponent },
  { path: "commentAddComponent", component: CommentAddComponent },
  { path: "commentListComponent", component: CommentListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { } CommentAddComponent