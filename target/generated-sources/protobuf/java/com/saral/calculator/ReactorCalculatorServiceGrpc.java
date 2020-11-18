package com.saral.calculator;

import static com.saral.calculator.CalculatorServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;


@javax.annotation.Generated(
value = "by ReactorGrpc generator",
comments = "Source: calculator/calculator.proto")
public final class ReactorCalculatorServiceGrpc {
    private ReactorCalculatorServiceGrpc() {}

    public static ReactorCalculatorServiceStub newReactorStub(io.grpc.Channel channel) {
        return new ReactorCalculatorServiceStub(channel);
    }

    public static final class ReactorCalculatorServiceStub extends io.grpc.stub.AbstractStub<ReactorCalculatorServiceStub> {
        private CalculatorServiceGrpc.CalculatorServiceStub delegateStub;

        private ReactorCalculatorServiceStub(io.grpc.Channel channel) {
            super(channel);
            delegateStub = CalculatorServiceGrpc.newStub(channel);
        }

        private ReactorCalculatorServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            super(channel, callOptions);
            delegateStub = CalculatorServiceGrpc.newStub(channel).build(channel, callOptions);
        }

        @Override
        protected ReactorCalculatorServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new ReactorCalculatorServiceStub(channel, callOptions);
        }

        public reactor.core.publisher.Mono<com.saral.calculator.Output> findSquare(reactor.core.publisher.Mono<com.saral.calculator.Input> reactorRequest) {
            return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactorRequest, delegateStub::findSquare, getCallOptions());
        }

        public reactor.core.publisher.Mono<com.saral.calculator.Output> findSquare(com.saral.calculator.Input reactorRequest) {
           return com.salesforce.reactorgrpc.stub.ClientCalls.oneToOne(reactor.core.publisher.Mono.just(reactorRequest), delegateStub::findSquare, getCallOptions());
        }

    }

    public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

        public reactor.core.publisher.Mono<com.saral.calculator.Output> findSquare(reactor.core.publisher.Mono<com.saral.calculator.Input> request) {
            throw new io.grpc.StatusRuntimeException(io.grpc.Status.UNIMPLEMENTED);
        }

        @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
            return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
                    .addMethod(
                            com.saral.calculator.CalculatorServiceGrpc.getFindSquareMethod(),
                            asyncUnaryCall(
                                    new MethodHandlers<
                                            com.saral.calculator.Input,
                                            com.saral.calculator.Output>(
                                            this, METHODID_FIND_SQUARE)))
                    .build();
        }

        protected io.grpc.CallOptions getCallOptions(int methodId) {
            return null;
        }

    }

    public static final int METHODID_FIND_SQUARE = 0;

    private static final class MethodHandlers<Req, Resp> implements
            io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
            io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
        private final CalculatorServiceImplBase serviceImpl;
        private final int methodId;

        MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
            this.serviceImpl = serviceImpl;
            this.methodId = methodId;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                case METHODID_FIND_SQUARE:
                    com.salesforce.reactorgrpc.stub.ServerCalls.oneToOne((com.saral.calculator.Input) request,
                            (io.grpc.stub.StreamObserver<com.saral.calculator.Output>) responseObserver,
                            serviceImpl::findSquare);
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("unchecked")
        public io.grpc.stub.StreamObserver<Req> invoke(io.grpc.stub.StreamObserver<Resp> responseObserver) {
            switch (methodId) {
                default:
                    throw new java.lang.AssertionError();
            }
        }
    }

}
