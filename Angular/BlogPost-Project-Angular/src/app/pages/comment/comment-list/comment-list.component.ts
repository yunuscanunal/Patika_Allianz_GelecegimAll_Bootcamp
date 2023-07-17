import { Component } from '@angular/core';
import { Comment } from '../comment';
import { CommentService } from '../comment.service';


@Component({
    selector: 'app-comment-list',
    templateUrl: './comment-list.component.html',
    styleUrls: ['./comment-list.component.css']
})
export class CommentListComponent {
    comments: Comment[] = [];
    editMode: boolean = false;
    comment: Comment = {
        commentId: 0,
        postId: 0,
        userId: 0,
        comment: "",
        creationDate: "",
        isConfirmed: false
    }

    constructor(private commentService: CommentService) {
        this.commentService.setComments();
        this.comments = this.commentService.getComments();
    }

    handleCommentEdit(id: number) {
        this.comment = this.comments.find((comment) => comment.commentId === id)!;
        this.editMode = true;
    }

    handleCommentDelete(id: number) {
        this.commentService.deleteComment(id);
        this.comments = this.commentService.getComments();
    }

    handleSaveEdit(id: number) {
        const commentToEdit = this.comments.find((comment) => comment.commentId === id);
        commentToEdit!.postId = this.comment.postId;
        commentToEdit!.userId = this.comment.userId;
        commentToEdit!.comment = this.comment.comment;
        commentToEdit!.creationDate = this.comment.creationDate;
        commentToEdit!.isConfirmed = this.comment.isConfirmed;
        this.editMode = false;
    }

    handleCancelEdit() {
        this.editMode = false;
    }
}