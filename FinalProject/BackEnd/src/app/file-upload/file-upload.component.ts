import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-file-upload',
  templateUrl: './file-upload.component.html',
  styleUrls: ['./file-upload.component.css']
})
export class FileUploadComponent {
  selectedFile: File | null = null;

  constructor(private http: HttpClient,
    private router:Router) {}

  onFileSelected(event: any): void {
    this.selectedFile = event.target.files[0];
  }

  uploadFile(): void {
    if (!this.selectedFile) {
      alert('Please select a file.');
      return;
    }

    const formData: FormData = new FormData();
    formData.append('file', this.selectedFile);

    this.http.post('http://localhost:8083/customer/upload-csv', formData,{responseType:'text'})
      .subscribe(
        () => {
          alert('File uploaded successfully.');
          this.router.navigate(['/home']);
        },
        (error) => {
          console.error('Error uploading file:', error);
          alert('File upload failed.');
          this.router.navigate(['/home']);
        }
      );
  }
}
