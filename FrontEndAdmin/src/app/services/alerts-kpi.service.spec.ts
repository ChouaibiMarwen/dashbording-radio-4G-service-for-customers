import { TestBed } from '@angular/core/testing';

import { AlertsKpiService } from './alerts-kpi.service';

describe('AlertsKpiService', () => {
  let service: AlertsKpiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AlertsKpiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
