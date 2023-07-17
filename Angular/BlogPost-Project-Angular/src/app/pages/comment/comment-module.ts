import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CommentListComponent } from './comment-list/comment-list.component';
import { CommentAddComponent } from './comment-add/comment-add.component';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AppModule } from 'src/app/app.module';

@NgModule({
    declarations: [
        CommentListComponent,
        CommentAddComponent,
    ],
    imports: [
        CommonModule,
        FormsModule,
        RouterModule,
        AppModule
    ]
})
export class CommentsModule { }