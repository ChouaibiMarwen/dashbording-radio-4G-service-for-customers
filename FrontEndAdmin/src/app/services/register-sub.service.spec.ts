import { TestBed } from '@angular/core/testing';

import { RegisterSubService } from './register-sub.service';

describe('RegisterSubService', () => {
  let service: RegisterSubService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RegisterSubService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
