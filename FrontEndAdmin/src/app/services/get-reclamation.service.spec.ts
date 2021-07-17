import { TestBed } from '@angular/core/testing';

import { GetReclamationService } from './get-reclamation.service';

describe('GetReclamationService', () => {
  let service: GetReclamationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GetReclamationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
