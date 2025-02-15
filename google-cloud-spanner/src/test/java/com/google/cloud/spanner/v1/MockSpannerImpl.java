/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spanner.v1;

import com.google.api.core.BetaApi;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import com.google.spanner.v1.BatchCreateSessionsRequest;
import com.google.spanner.v1.BatchCreateSessionsResponse;
import com.google.spanner.v1.BeginTransactionRequest;
import com.google.spanner.v1.CommitRequest;
import com.google.spanner.v1.CommitResponse;
import com.google.spanner.v1.CreateSessionRequest;
import com.google.spanner.v1.DeleteSessionRequest;
import com.google.spanner.v1.ExecuteBatchDmlRequest;
import com.google.spanner.v1.ExecuteBatchDmlResponse;
import com.google.spanner.v1.ExecuteSqlRequest;
import com.google.spanner.v1.GetSessionRequest;
import com.google.spanner.v1.ListSessionsRequest;
import com.google.spanner.v1.ListSessionsResponse;
import com.google.spanner.v1.PartialResultSet;
import com.google.spanner.v1.PartitionQueryRequest;
import com.google.spanner.v1.PartitionReadRequest;
import com.google.spanner.v1.PartitionResponse;
import com.google.spanner.v1.ReadRequest;
import com.google.spanner.v1.ResultSet;
import com.google.spanner.v1.RollbackRequest;
import com.google.spanner.v1.Session;
import com.google.spanner.v1.SpannerGrpc.SpannerImplBase;
import com.google.spanner.v1.Transaction;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.annotation.Generated;

@BetaApi
@Generated("by gapic-generator-java")
public class MockSpannerImpl extends SpannerImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockSpannerImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void createSession(
      CreateSessionRequest request, StreamObserver<Session> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Session) {
      requests.add(request);
      responseObserver.onNext(((Session) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method CreateSession, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Session.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void batchCreateSessions(
      BatchCreateSessionsRequest request,
      StreamObserver<BatchCreateSessionsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof BatchCreateSessionsResponse) {
      requests.add(request);
      responseObserver.onNext(((BatchCreateSessionsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method BatchCreateSessions, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  BatchCreateSessionsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void getSession(GetSessionRequest request, StreamObserver<Session> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Session) {
      requests.add(request);
      responseObserver.onNext(((Session) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method GetSession, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Session.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void listSessions(
      ListSessionsRequest request, StreamObserver<ListSessionsResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ListSessionsResponse) {
      requests.add(request);
      responseObserver.onNext(((ListSessionsResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ListSessions, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ListSessionsResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void deleteSession(DeleteSessionRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method DeleteSession, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void executeSql(ExecuteSqlRequest request, StreamObserver<ResultSet> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ResultSet) {
      requests.add(request);
      responseObserver.onNext(((ResultSet) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ExecuteSql, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ResultSet.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void executeStreamingSql(
      ExecuteSqlRequest request, StreamObserver<PartialResultSet> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PartialResultSet) {
      requests.add(request);
      responseObserver.onNext(((PartialResultSet) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ExecuteStreamingSql, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PartialResultSet.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void executeBatchDml(
      ExecuteBatchDmlRequest request, StreamObserver<ExecuteBatchDmlResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ExecuteBatchDmlResponse) {
      requests.add(request);
      responseObserver.onNext(((ExecuteBatchDmlResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method ExecuteBatchDml, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ExecuteBatchDmlResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void read(ReadRequest request, StreamObserver<ResultSet> responseObserver) {
    Object response = responses.poll();
    if (response instanceof ResultSet) {
      requests.add(request);
      responseObserver.onNext(((ResultSet) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method Read, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  ResultSet.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void streamingRead(
      ReadRequest request, StreamObserver<PartialResultSet> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PartialResultSet) {
      requests.add(request);
      responseObserver.onNext(((PartialResultSet) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method StreamingRead, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PartialResultSet.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void beginTransaction(
      BeginTransactionRequest request, StreamObserver<Transaction> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Transaction) {
      requests.add(request);
      responseObserver.onNext(((Transaction) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method BeginTransaction, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Transaction.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void commit(CommitRequest request, StreamObserver<CommitResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof CommitResponse) {
      requests.add(request);
      responseObserver.onNext(((CommitResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method Commit, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  CommitResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void rollback(RollbackRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.poll();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext(((Empty) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method Rollback, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  Empty.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void partitionQuery(
      PartitionQueryRequest request, StreamObserver<PartitionResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PartitionResponse) {
      requests.add(request);
      responseObserver.onNext(((PartitionResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method PartitionQuery, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PartitionResponse.class.getName(),
                  Exception.class.getName())));
    }
  }

  @Override
  public void partitionRead(
      PartitionReadRequest request, StreamObserver<PartitionResponse> responseObserver) {
    Object response = responses.poll();
    if (response instanceof PartitionResponse) {
      requests.add(request);
      responseObserver.onNext(((PartitionResponse) response));
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError(((Exception) response));
    } else {
      responseObserver.onError(
          new IllegalArgumentException(
              String.format(
                  "Unrecognized response type %s for method PartitionRead, expected %s or %s",
                  response == null ? "null" : response.getClass().getName(),
                  PartitionResponse.class.getName(),
                  Exception.class.getName())));
    }
  }
}
